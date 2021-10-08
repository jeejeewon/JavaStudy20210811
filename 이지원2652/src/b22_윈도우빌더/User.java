package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.dao.DeleteUSerDao;
import b22_윈도우빌더.dao.DeleteUserDaoImpl;
import b22_윈도우빌더.dao.UpdateUserDao;
import b22_윈도우빌더.dao.UpdateUserDaoImpl;
import b22_윈도우빌더.dto.UserDto;
import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class User extends JFrame {
	
	private UserDto loginSession;

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;	
	private JTextField login_id_tf;
	private JPasswordField login_pwd_tf;
	private JTextField id_tf;
	private JTextField pwd_tf;
	private JTextField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JComboBox gender_cb;
	private JLabel welcomMsg;
	private String[] gender_list = {"선택","남성","여성","선택하지 않음"};	
	private JPasswordField new_pwd_tf;
	private JPasswordField new_repwd_tf;
	
	
	private LoginService loginService;
	private SignUpService signUpService;
	private DeleteUSerDao deleteUserDao;
	private UpdateUserDao updateUserDao;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
		deleteUserDao = new DeleteUserDaoImpl(); 
		updateUserDao = new UpdateUserDaoImpl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 672);
		mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);		
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		login_id_tf = new JTextField();
		login_id_tf.setColumns(10);
		login_id_tf.setBounds(343, 251, 149, 23);
		login_pan.add(login_id_tf);
		
		JButton login_btn = new JButton("로그인");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheck(login_id_tf.getText(), login_pwd_tf.getText());
				if(flag!= 2) {
					String msg = null;
					if(flag == 0) {
						msg = "존재하지 않는 아이디입니다.";
					} else if(flag == 1) {
						msg = "비밀번호를 다시 확인해주세요.";
					} else if(flag == 3) {
						msg = "아이디를 입력해주세요.";
					} else if(flag == 4) {
						msg = "비밀번호를 입력해주세요.";
					}
					JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					cl_mainCardPan.show(mainCardPan, "index_pan");					
					loginSession = loginService.getUserDto(login_id_tf.getText());
					welcomMsg.setText(loginSession.getUser_name() + "님 환영합니다.");
				}
			}
		});
		login_btn.setBounds(510, 251, 88, 57);
		login_pan.add(login_btn);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setBounds(274, 255, 57, 15);
		login_pan.add(idLabel);
		
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLabel.setBounds(274, 289, 57, 15);
		login_pan.add(pwdLabel);
		
		login_pwd_tf = new JPasswordField();
		login_pwd_tf.setBounds(343, 286, 149, 22);
		login_pan.add(login_pwd_tf);
		
		JButton sign_up = new JButton("회원가입");
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan,"sign_up_pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
				
				login_id_tf.setText("");
				login_pwd_tf.setText("");
				
			}
		});
		sign_up.setBounds(381, 333, 97, 23);
		login_pan.add(sign_up);
		
		JPanel sign_up_pan = new JPanel();
		mainCardPan.add(sign_up_pan, "sign_up_pan");
		sign_up_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(273, 109, 57, 15);
		sign_up_pan.add(lblNewLabel);
		
		id_tf = new JTextField();
		id_tf.setBounds(345, 106, 144, 21);
		sign_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(273, 150, 57, 15);
		sign_up_pan.add(lblNewLabel_1);
		
		pwd_tf = new JTextField();
		pwd_tf.setBounds(345, 147, 220, 21);
		sign_up_pan.add(pwd_tf);
		pwd_tf.setColumns(10);
		
		repwd_tf = new JTextField();
		repwd_tf.setColumns(10);
		repwd_tf.setBounds(345, 188, 220, 21);
		sign_up_pan.add(repwd_tf);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(213, 191, 117, 15);
		sign_up_pan.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(273, 236, 57, 15);
		sign_up_pan.add(lblNewLabel_2);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(345, 233, 220, 21);
		sign_up_pan.add(name_tf);
		
		JLabel lblNewLabel_2_1 = new JLabel("연락처");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(273, 278, 57, 15);
		sign_up_pan.add(lblNewLabel_2_1);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(345, 275, 220, 21);
		sign_up_pan.add(phone_tf);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("이메일");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setBounds(273, 320, 57, 15);
		sign_up_pan.add(lblNewLabel_2_1_1);
		
		email_tf = new JTextField();
		email_tf.setColumns(10);
		email_tf.setBounds(345, 317, 220, 21);
		sign_up_pan.add(email_tf);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("성별");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1.setBounds(273, 365, 57, 15);
		sign_up_pan.add(lblNewLabel_2_1_1_1);
		
		gender_cb = new JComboBox(gender_list);
		gender_cb.setBounds(345, 365, 220, 25);
		sign_up_pan.add(gender_cb);
		
		JButton sign_up_btn = new JButton(" 가입하기");
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tf.getText(),
						pwd_tf.getText(),
						repwd_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						gender_cb.getSelectedItem().toString(),
						Integer.toString(gender_cb.getSelectedIndex())
						
				};
				String errorMsg = signUpService.isEmptyValue(values);
				if(!errorMsg.equals("value is not null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				} else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "비밀번호 오류 ", JOptionPane.ERROR_MESSAGE);
					} else {
						boolean flag = signUpService.signUp(values);
						JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.", "회원가입 성공 ", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan,"login_pan");										
					}
				}
				
			}
		});
		sign_up_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sign_up_btn.setBounds(345, 427, 97, 23);
		sign_up_pan.add(sign_up_btn);
		
		JButton id_chk_btn = new JButton("중복확인");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showMessageDialog(null,"아이디를 입력하세요.","경고", JOptionPane.ERROR_MESSAGE);
				} else if (flag == 1) {
					JOptionPane.showMessageDialog(null,"존재하는 아이디입니다.","아이디 중복", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 0) {
					int select =  JOptionPane.showConfirmDialog(null,"사용가능한 아이디입니다.\n사용하시겠습니까?","아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tf.setEditable(false);
					}					
				}
				
			}
		});
		id_chk_btn.setBounds(484, 105, 97, 23);
		sign_up_pan.add(id_chk_btn);
		
		JButton page_back_btn = new JButton("뒤로가기");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan,"login_pan");
				
			}
		});
		page_back_btn.setBounds(468, 427, 97, 23);
		sign_up_pan.add(page_back_btn);
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan");
		index_pan.setLayout(null);
		
		welcomMsg = new JLabel("New label");
		welcomMsg.setBounds(22, 20, 360, 25);
		index_pan.add(welcomMsg);
		
		JButton logout_btn = new JButton("로그아웃");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					cl_mainCardPan.show(mainCardPan,"login_pan");
					loginSession = null;
					login_id_tf.setText("");
					login_pwd_tf.setText("");	
					
				} 
			}
		});
		logout_btn.setBounds(747, 10, 97, 23);
		index_pan.add(logout_btn);
		
		JButton mypage_btn = new JButton("마이페이지");
		mypage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan,"mypage_pan"
						+ "");
			}
		});
		mypage_btn.setBounds(638, 10, 97, 23);
		index_pan.add(mypage_btn);
		
		JPanel mypage_pan = new JPanel();
		mainCardPan.add(mypage_pan, "mypage_pan");
		mypage_pan.setLayout(null);
		
		JButton user_drop_btn = new JButton("회원탈퇴");
		user_drop_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?","회원탈퇴", JOptionPane.YES_NO_OPTION );
				if(flag == 0) {
					boolean dropFlag = deleteUserDao.deleteUser(loginSession.getUser_id());
					cl_mainCardPan.show(mainCardPan,"login_pan");
					login_id_tf.setText("");
					login_pwd_tf.setText("");	
				}
				 
			}
		});
		user_drop_btn.setBounds(747, 590, 97, 23);
		mypage_pan.add(user_drop_btn);
		
		JLabel lblNewLabel_3 = new JLabel("마이페이지");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(368, 49, 97, 15);
		mypage_pan.add(lblNewLabel_3);		
		
		JLabel lblNewLabel_4 = new JLabel("새 비밀번호");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(568, 164, 97, 15);
		mypage_pan.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("새 비밀번호 확인");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setBounds(568, 191, 97, 15);
		mypage_pan.add(lblNewLabel_4_1);
		
		new_pwd_tf = new JPasswordField();
		new_pwd_tf.setBounds(677, 161, 113, 21);
		new_pwd_tf.setEditable(false);
		mypage_pan.add(new_pwd_tf);
		
		new_repwd_tf = new JPasswordField();
		new_repwd_tf.setBounds(677, 188, 113, 21);
		new_repwd_tf.setEditable(false);
		mypage_pan.add(new_repwd_tf);
		
		JButton update_btn = new JButton("수정 완료");
		update_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(new_pwd_tf.getText().equals(new_repwd_tf.getText())) {
					boolean flag = updateUserDao.updatePassword(loginSession.getUser_id(),new_pwd_tf.getText());
					if (flag == true) {
						loginSession.setUser_pwd(new_pwd_tf.getText());
						JOptionPane.showMessageDialog(null,"비밀번호 변경 완료","완료", JOptionPane.INFORMATION_MESSAGE);
						new_pwd_tf.setText("");
						new_repwd_tf.setText("");
						new_pwd_tf.setEditable(false);
						new_repwd_tf.setEditable(false);
						update_btn.setEnabled(false);
					}	
				} else {
					JOptionPane.showMessageDialog(null,"비밀번호가 일치하지 않습니다.","비밀번호 확인", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		update_btn.setBounds(693, 219, 97, 23);
		update_btn.setEnabled(false);
		mypage_pan.add(update_btn);
		
		JButton update_pwd_btn = new JButton("비밀번호 수정");
		update_pwd_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				while(true) {
					String  originPwd = JOptionPane.showInputDialog(null, "기존의 비밀번호를 입력해주세오.","비밀번호 수정", JOptionPane.YES_NO_OPTION);
					if(loginSession.getUser_pwd().equals(originPwd)) {
						new_pwd_tf.setEditable(true);
						new_repwd_tf.setEditable(true);
						update_btn.setEnabled(true);											
						break;
					} else if(originPwd == null) {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		update_pwd_btn.setBounds(601, 590, 134, 23);
		mypage_pan.add(update_pwd_btn);
	}
}
